import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;


public class APITest {

        @Test
        public void getUserId() {
            Response response = given().get("https://jsonplaceholder.typicode.com/users?id=4");
            String responseString = response.asString();
            System.out.println("Response"+responseString);
            System.out.println("Status Code: "+response.getStatusCode());
            Assert.assertEquals(response.getStatusCode(),200);

            // get the user email address from the response
            JsonPath jPath = new JsonPath(responseString);
            String emailAddress = jPath.getString("email");
            System.out.println("Email address"+emailAddress);
        }

        @Test
        public void userassociatedPost() {
            Response response = given().contentType(ContentType.JSON).
                                when().get("https://jsonplaceholder.typicode.com/posts?userId=2").
                                then().assertThat().statusCode(200).extract().response();
            String responseInString = response.asString();
            System.out.println("Status Code: "+responseInString);

            // Using the userID, get the user’s associated posts and
            JsonPath jsonPath = new JsonPath(responseInString);
            String userPosts = jsonPath.getString("title");
            System.out.println("User associated posts: "+userPosts);

            // verify the Posts contain valid Post IDs (an Integer between 1 and 100).
            String postId = response.asString();
            System.out.println("Post ID: "+postId);
            response.then().assertThat().body("id", everyItem(allOf(greaterThanOrEqualTo(1), lessThanOrEqualTo(100))));
        }

        @Test
        public void putUser(){
            JSONObject request=new JSONObject();
            request.put("userId","2");
            request.put("title","Hello");
            request.put("body","Hello Ali, How are you?");
            System.out.println(request.toJSONString());
                    given().body(request.toJSONString()).
                    when().post("https://jsonplaceholder.typicode.com/posts").
                    then().statusCode(201);
        }
    }

