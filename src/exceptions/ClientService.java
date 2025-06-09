package exceptions;

/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 9, 2025
 */

public class ClientService {

	public static void searchClient(String code) throws ClientNotFoundException {
		// Search logic...
		boolean isRegistered = false;
		if (!isRegistered) {
			throw new ClientNotFoundException("Client not found.");
		} else {
			// Register logic
		}
	}
}
