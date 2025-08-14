package school.sptech.sprint1_nota1.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioAquecimentoController {

    @GetMapping("/ex-00/{numero}")
    public Boolean exercicioAquecimento(int numero) {
        return null;
    }
}
