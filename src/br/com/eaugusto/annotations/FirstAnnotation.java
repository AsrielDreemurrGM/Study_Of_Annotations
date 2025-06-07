/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 7, 2025
 */

package br.com.eaugusto.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.TYPE })
public @interface FirstAnnotation {

	// If there is only one parameter, its name HAS to be "value"
	String value();

	// Return types in annotations MUST be primitives, String, Class or Arrays of
	// any of the previously mentioned types
	String[] neighborhoods();

	// The declaration of a method in an annotation type cannot have a parameter or
	// a throws clause, which indicates an exception being thrown.
	long houseNumber();

	// This Method is optional, since if not defined will use the default value
	double[] values() default 10d;

	// Methods MUST NOT have a body - They are to be specified as an abstract method
	// Additionally, the return type of a method will be the data type of said
	// element
}
