package reusableComponents;

import org.apache.commons.codec.binary.Base64;

public final class SecurityClass 
{

	private SecurityClass() {

	}

	/********************************************************************
	 * 
	 * encryptXOR(String message, String key)
	 * 
	 * Uses provided key to encrypt provided message using simple XOR
	 * 
	 *********************************************************************/

	public static String encryptXOR(String message, String key) {

		try {
			if (message == null || key == null)
				return null;

			char[] keys = key.toCharArray();
			char[] mesg = message.toCharArray();

			int ml = mesg.length;
			int kl = keys.length;
			char[] newmsg = new char[ml];

			for (int i = 0; i < ml; i++) 
			{
				newmsg[i] = (char) (mesg[i] ^ keys[i % kl]);
			}
			mesg = null;
			keys = null;
			Base64 base64 = new Base64();
			String encodedString = new String(base64.encode(new String(newmsg).getBytes()));
			return encodedString;

		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}

	}

	/********************************************************************
	 * 
	 * decryptXOR(String message, String key)
	 * 
	 * Uses provided key to decrypt provided message encrypted using the same
	 * key
	 * 
	 *********************************************************************/

	public static String decryptXOR(String message, String key) {
		try {
			if (message == null || key == null)
				return null;
			Base64 base64 = new Base64();
			char[] keys = key.toCharArray();
			char[] mesg = new String(base64.decode(message)).toCharArray();
			int ml = mesg.length;
			int kl = keys.length;
			char[] newmsg = new char[ml];

			for (int i = 0; i < ml; i++) {
				newmsg[i] = (char) (mesg[i] ^ keys[i % kl]);
			}
			mesg = null;
			keys = null;
			return new String(newmsg);
		} catch (Exception e) {
			return null;
		}
	}

}
