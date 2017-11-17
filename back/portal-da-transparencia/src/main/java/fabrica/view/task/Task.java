package fabrica.view.task;

import fabrica.view.api.WebServiceConfiguracao;
import org.apache.log4j.Logger;

/**
 * @author gabriel
 * @version 1.0.0
 * @see WebServiceConfiguracao
 */
public abstract class Task implements Runnable {

    //Intermitencia entre as execuções da task.
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
            LOG.error("Erro ao executar task: " + getClass().getSimpleName()
             + "\nException: " + e.getMessage());
        }
    }
}
