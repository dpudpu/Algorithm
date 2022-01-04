package leetcode

class Codec() {
    val map: HashMap<String, String> = hashMapOf()
    val url = "http://tinyurl.com/"

    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String =
        (url + longUrl.hashCode()).also {
            map[it] = longUrl
        }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String = map[shortUrl] ?: ""
}
