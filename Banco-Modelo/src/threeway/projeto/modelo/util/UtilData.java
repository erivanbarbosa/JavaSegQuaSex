package threeway.projeto.modelo.util;

import java.util.Calendar;
import java.util.Date;

public class UtilData {
	// representa Domingo
		static final int DOMINGO = Calendar.SUNDAY;

		// Segunda-Feira
		static final int SEGUNDA = Calendar.MONDAY;

		// Ter�a-Feira
		static final int TER�A = Calendar.TUESDAY;

		// Quarta-Feira
		static final int QUARTA = Calendar.WEDNESDAY;

		// Quinta-Feira
		static final int QUINTA = Calendar.THURSDAY;

		// Sexta-Feira
		static final int SEXTA = Calendar.FRIDAY;

		// S�bado
		static final int S�BADO = Calendar.SATURDAY;

		// Constr�i uma data representando agora
		public static Date data() {

			return Calendar.getInstance().getTime();
		}

		// Constr�i uma data representando um dado dia.
		// Para efetuar compara��es entre datas, hora ser� 00:00:00.0 (0 horas, 0 minutos, 0 segundos, 0 milissegundos)
		public static Calendar data(int dia, int mes, int ano) {

			return data(dia, mes, ano, 0, 0, 0);
		}

		// Constr�i uma data representando um dado dia e hora.
		// Para permitir compara��es de datas, os milissegundos da data s�o zerados.
		public static Calendar data(int dia, int mes, int ano, int hora, int min, int seg) {

			Calendar data = Calendar.getInstance();
			data.set(ano, --mes, dia, hora, min, seg);
			data.set(Calendar.MILLISECOND, 0);
			return data;
		}

		// Retorna uma data com dia, mes e ano passado como String e formato como argumento
		public static Calendar data(String data) {

			return data(Integer.valueOf(data.split("/")[0]), Integer.valueOf(data.split("/")[1]), Integer.valueOf(data.split("/")[2]));
		}

		public static Date getDate(Calendar data) {

			return data.getTime();
		}

		// Formata uma data no formato dd/mm/aaaa
		public static String DDMMAAAA(Date data) {

			return new java.text.SimpleDateFormat("dd/MM/yyyy").format(data);
		}

		// Formata uma data no formato dd/mm/aaaa hh:mm
		public static String DDMMAAAAHHMM(Date data) {

			return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
		}

		// m�todo est�tico que retorna o valor da data formatado como String
		public static String agora(Date data) {

			return new java.text.SimpleDateFormat("dd/MM/yyyy  HH:mm").format(data);
		}

		// Retorna o Ano correspondente a esta data
		public int getAno(Date data) {

			final Calendar calendario = Calendar.getInstance();

			calendario.setTime(data);

			return calendario.get(Calendar.YEAR);
		}

		// Retorna o m�s correspondendo a esta data.
		public int getMes(Date data) {

			final Calendar calendario = Calendar.getInstance();

			calendario.setTime(data);

			return calendario.get(Calendar.MONTH);
		}

		// Retorna o dia correspondendo a esta data.
		public int getDia(Date data) {

			final Calendar calendario = Calendar.getInstance();

			calendario.setTime(data);

			return calendario.get(Calendar.DAY_OF_MONTH);
		}

		// Acrescenta um n�mero de dias � data.
		public void somarDia(Date data, int numDias) {

			final Calendar calendario = Calendar.getInstance();

			calendario.setTime(data);

			calendario.add(Calendar.DAY_OF_MONTH, numDias);
		}
}
