package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DesafiosStreamAPI {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 01:
        System.out.println("Desafio 01 - Mostre a lista na ordem numérica:");
        // List<Integer> numerosOrdenados =
        numerosAleatorios.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList())
                .forEach(System.out::println);

        // Desafio 02:
        System.out.println("Desafio 02 - Imprima a soma dos números pares da lista:");
        String resultado = numerosAleatorios.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum).toString(); // .for
                                                                                                                  // forEach(System.out::Prinln);
        System.out.println(resultado);

        Optional<String> optionalValue = Optional.ofNullable(null);
        System.out.println("OptionalValue is null? " + optionalValue.isEmpty());

        optionalValue = Optional.ofNullable("Teste de not null...");
        String result = optionalValue.orElse("Default");
        System.out.println("Resultado do OptionalValue 'orElse': " + result);
    }
}
