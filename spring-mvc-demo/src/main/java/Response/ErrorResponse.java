package Response;

import lombok.Data;

@Data
public class ErrorResponse {
    String message;
    String statusCode;

    public ErrorResponse(String user_can_not_found, String s) {
    }
}
