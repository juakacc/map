package lab1;

import java.util.Calendar;

/**
 * Classe para representar um horário de determinada disciplina.
 *
 */
public class Horario {

	private Calendar c;

	public Horario(int dia, int horas, int minutos) {
		c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, dia);
		c.set(Calendar.HOUR, horas);
		c.set(Calendar.MINUTE, minutos);
	}

	@Override
	public String toString() {
		String str = c.get(Calendar.DAY_OF_WEEK) + "a às " + c.get(Calendar.HOUR) + "h" + c.get(Calendar.MINUTE);
		return str;
	}
}