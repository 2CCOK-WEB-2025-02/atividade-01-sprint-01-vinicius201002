package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        if (n <= 0) {
            return new ExercicioDificilResponse(0L, 0L);
        }

        if (n == 1) {

            return new ExercicioDificilResponse(1L, 1L);
        }

        long termoAnterior = 0L;
        long termoAtual = 1L;
        long soma = 1L;
        for (int i = 2; i <= n; i++) {
            long proximoTermo = termoAnterior + termoAtual;

            soma += proximoTermo;

            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }

        return new ExercicioDificilResponse(termoAtual, soma);

    }
}
