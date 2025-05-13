public class TestCustomException {

    public static void main(String[] args) throws CreateCustomException {
        int i=9,j=90;
        if(i<j){
            throw new CreateCustomException("i is less than j");
        }
    }
}
