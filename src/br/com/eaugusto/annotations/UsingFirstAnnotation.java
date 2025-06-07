/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 7, 2025
 */

package br.com.eaugusto.annotations;

// Classes HAVE to inform the parameters defined in the annotation unless there is a default value defined
@FirstAnnotation(value = "Eduardo", neighborhoods = "Test", houseNumber = 10)
public class UsingFirstAnnotation {

	@FirstAnnotation(value = "Augusto", neighborhoods = { "Java", "World" }, houseNumber = 404, values = { 100d, 200d })
	private String name;
}
