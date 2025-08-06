import java.util.HashMap;
import java.util.Map;

public class Hero {
    private static HashMap<String, String> tipos;
    private String nome;
    private int idade;
    private final String tipo;

    public Hero(String nome, int idade, String tipo){
        tipos = new HashMap<>();

        tipos.put("mago", "magia");
        tipos.put("guerreiro", "espada");
        tipos.put("monge", "artes marciais");
        tipos.put("ninja", "shuriken");

        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Hero hero = new Hero("Aang", 12, "monge");

        System.out.println();
        hero.atacar();


    }

    public void atacar() {
        for (Map.Entry<String, String> heroTipe : tipos.entrySet()){
            if (heroTipe.getKey().equals(tipo)) {
                String ataque = heroTipe.getValue();
                System.out.println("o "+ tipo + " atacou usando " + ataque);
            }
        }
    }
}
