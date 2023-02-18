package jan30.fp;

@FunctionalInterface
public interface ParamInput {
    int ifFunction(int a, int b);
}

class Calculate {
    public void Sum(ParamInput param) {
        int number = param.ifFunction(3, 4);
        System.out.println("Number is " + number);
    }

    public static void main(String[] args) {
        Calculate test = new Calculate();

        // 람다식 x
        test.Sum(new ParamInput() {
            @Override
            public int ifFunction(int a, int b) {
                System.out.printf("%d + %d = %d%n", a, b, a + b);
                return a + b;
            }
        });

        // 람다식 o
        test.Sum((a, b) -> {
            System.out.printf("%d + %d = %d%n", a, b, a + b);
            return a + b;
        });
    }
}