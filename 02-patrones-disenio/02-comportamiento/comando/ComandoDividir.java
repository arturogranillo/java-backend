public class ComandoDividir extends ComandoCalculadora implements Comando {
    public ComandoDividir(float acumulador, float valor) {
      super(acumulador, valor);
    }
  
    public float ejecutar() {
      return acumulador / valor;
    }
  }