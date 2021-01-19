package br.com.alura.flyweight;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.flyweight.notas.Do;
import br.com.alura.flyweight.notas.Fa;
import br.com.alura.flyweight.notas.La;
import br.com.alura.flyweight.notas.Mi;
import br.com.alura.flyweight.notas.Re;
import br.com.alura.flyweight.notas.Si;
import br.com.alura.flyweight.notas.Sol;

public class NotasMusicais {

    private static Map<String, Nota> notas =
            new HashMap<String, Nota>();

    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());
    }
    public Nota pega(String nome) {
        return notas.get(nome);
    }
}
