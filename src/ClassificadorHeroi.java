public class ClassificadorHeroi {
    public static void main(String[] args) {
        String heroine = "Mulher Maravilha";
        String[] level = {"Ferro","Bronze","Prata","Ouro","Platina","Ascendente","Imortal","Radiante"};
        int bonusXp = 970;
        int numberBattles = 7;
        int totalXp = 0;

        for(int i = 0; i <= numberBattles; i++) {
            totalXp += bonusXp;
            System.out.println(totalXp);
        }
        if (totalXp <= 1000){
            System.out.println("A Heróina de nome " + heroine + " está no nível de " + level [0]);
        } else if (totalXp >= 1001 && totalXp <= 2000){
            System.out.println("A Heróina de nome " + heroine + " está no nível de " + level [1]);
        } else if (totalXp >=2001 && totalXp <= 5000){
            System.out.println("A Heróina de nome " + heroine + " está no nível de " + level [2]);
        } else if (totalXp >= 5001 && totalXp <= 7000){
            System.out.println("A Heróina de nome " + heroine + " está no nível de " + level [3]);
        } else if (totalXp >=7001 && totalXp <= 8000 ){
            System.out.println("A Heróina de nome " + heroine + " está no nível de " + level [4]);
        }else if (totalXp >=8001 && totalXp <= 9000){
            System.out.println("A Heróina de nome " + heroine + " está no nível de " + level [5]);
        }else if (totalXp >=9001 && totalXp <= 10000){
            System.out.println("A Heróina de nome " + heroine + " está no nível de " + level [6]);
        }else if (totalXp > 10001){
            System.out.println("A Heróina de nome " + heroine + " está no nível de " + level [7]);
        }
    }

}
