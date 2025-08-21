package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {

    private Long enesimoTermo;
    private Long soma;

    public ExercicioDificilResponse(Long enesimoTermo, Long soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public Long getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(Long enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }

    public Long getSoma() {
        return soma;
    }

    public void setSoma(Long soma) {
        this.soma = soma;
    }
}
