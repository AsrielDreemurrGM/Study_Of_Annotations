package br.com.eaugusto.annotations;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 11, 2025
 */
public class App {

	public static void main(String[] args) {

		getTableName();
	}

	public static void getTableName() {
		Class<UsingTableAnnotation> usingTableAnnotationClass = UsingTableAnnotation.class;

		TableAnnotation annotation = usingTableAnnotationClass.getAnnotation(TableAnnotation.class);
		if (annotation != null) {
			System.out.println("Table Value/Name: " + annotation.value());
		}
	}
}
