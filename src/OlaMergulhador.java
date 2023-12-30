public class OlaMergulhador {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String fullName = "Edvaldo Leite";
        int myAge = 14;
        int yourAge = 46;
        int sum = myAge + yourAge;
        double myWeight = 96.8;
        float mySalary = 4_584.22f;
        boolean approvedPurchase = true;
        boolean ofLegalAge = (myAge > 18?true:false);

        System.out.println("Nome Completo: " + fullName);
        System.out.println("Minha Idade: " + myAge);
        System.out.println("Sua Idade: " + yourAge);
        System.out.println("Soma das idades: " + sum);
        System.out.println("Meu Peso: " + myWeight);
        System.out.println("Salário Atual: " + mySalary);
        System.out.println("Compra Aprovada: " + approvedPurchase);
        System.out.println("Maior de idade? : " + ofLegalAge);

    }
}
