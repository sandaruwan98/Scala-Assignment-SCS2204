import scala.io.StdIn._

object CaesarCipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val text = readLine("Enter text : ")
  val key = readLine("Enter Key : ").toInt

  val Encrypt = (c: Char, key: Int, a: String) =>
    a((a.indexOf(c.toUpper) + key) % a.size)

  val Decrypt = (c: Char, key: Int, a: String) =>
    if ((a.indexOf(c.toUpper) - key) >= 0) a((a.indexOf(c.toUpper) - key))
    else a(a.size + (a.indexOf(c.toUpper) - key))

  val cipher = (
      algo: (Char, Int, String) => Char,
      s: String,
      key: Int,
      alphabet: String
  ) => s.map(algo(_, key, alphabet))
  val encText = cipher(Encrypt, text, key, alphabet)
  println("Encrypted text :" + encText)
  println("Decrypted text :" + cipher(Decrypt, encText, key, alphabet))
}
