
public class returnMultiple {

}

class Main {

    public static void main(String[] args) {

        MyResponse response = requestResponse();

        System.out.println( response.toString() );

    }

    private static MyResponse requestResponse() {

        return new MyResponse( "this is first arg", "this is second arg" );
    }
}

class MyResponse {

    private String x, y;

    public MyResponse( String x, String y ) {

        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {

        return "x: " + x + "\t y: " + y;
    }

}
