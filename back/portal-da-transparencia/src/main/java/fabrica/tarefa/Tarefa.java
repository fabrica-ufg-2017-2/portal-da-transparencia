package fabrica.tarefa;

import org.apache.log4j.Logger;

/**
 * @author gabriel
 * @version 1.0.0
 * @see fabrica.controller.Configuracao
 */
public abstract class Tarefa implements Runnable {

    //Intermitencia entre as execuções da tarefa.
    protected Long intermitencia;

    //Tarefa a ser executada.
    protected Runnable tarefa;

    //Controle de log.
    private Logger LOG = Logger.getLogger(getClass());

    public void run() {
        try {
            while (true) {
                tarefa.run();
                Thread.sleep(intermitencia);
            }
        } catch (Exception e) {
            LOG.error("Erro ao executar tarefa: " + getClass().getSimpleName()
             + "\nException: " + e.getMessage());
        }
    }
}
