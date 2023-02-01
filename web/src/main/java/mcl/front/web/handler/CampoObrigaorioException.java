package mcl.front.web.handler;

public class CampoObrigaorioException extends BusinessException{

  public CampoObrigaorioException(String campo) {
    super("O campo %s é obrigatório", campo);
    
  }
  
}
