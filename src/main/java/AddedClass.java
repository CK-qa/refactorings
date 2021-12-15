import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddedClass {

    String stringValue;

    public int length() {
        return stringValue.length();
    }

    public char charAt(int index) {
        return stringValue.charAt(index);
    }

    public int codePointAt(int index) {
        return stringValue.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return stringValue.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return stringValue.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return stringValue.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        stringValue.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        stringValue.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return stringValue.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return stringValue.getBytes(charset);
    }

    public byte[] getBytes() {
        return stringValue.getBytes();
    }

    public boolean contentEquals(StringBuffer sb) {
        return stringValue.contentEquals(sb);
    }

    public boolean contentEquals(CharSequence cs) {
        return stringValue.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return stringValue.equalsIgnoreCase(anotherString);
    }

    public int compareTo(String anotherString) {
        return stringValue.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String str) {
        return this.stringValue.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return stringValue.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return stringValue.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(String prefix, int toffset) {
        return stringValue.startsWith(prefix, toffset);
    }

    public boolean startsWith(String prefix) {
        return stringValue.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return stringValue.endsWith(suffix);
    }

    public int indexOf(int ch) {
        return stringValue.indexOf(ch);
    }

    public int indexOf(int ch, int fromIndex) {
        return stringValue.indexOf(ch, fromIndex);
    }

    public int lastIndexOf(int ch) {
        return stringValue.lastIndexOf(ch);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return stringValue.lastIndexOf(ch, fromIndex);
    }

    public int indexOf(String str) {
        return this.stringValue.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return this.stringValue.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return this.stringValue.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return this.stringValue.lastIndexOf(str, fromIndex);
    }

    public String substring(int beginIndex) {
        return stringValue.substring(beginIndex);
    }

    public String substring(int beginIndex, int endIndex) {
        return stringValue.substring(beginIndex, endIndex);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return stringValue.subSequence(beginIndex, endIndex);
    }

    public String concat(String str) {
        return this.stringValue.concat(str);
    }

    public String replace(char oldChar, char newChar) {
        return stringValue.replace(oldChar, newChar);
    }

    public boolean matches(String regex) {
        return stringValue.matches(regex);
    }

    public boolean contains(CharSequence s) {
        return stringValue.contains(s);
    }

    public String replaceFirst(String regex, String replacement) {
        return stringValue.replaceFirst(regex, replacement);
    }

    public String replaceAll(String regex, String replacement) {
        return stringValue.replaceAll(regex, replacement);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return stringValue.replace(target, replacement);
    }

    public String[] split(String regex, int limit) {
        return stringValue.split(regex, limit);
    }

    public String[] split(String regex) {
        return stringValue.split(regex);
    }

    public String toLowerCase(Locale locale) {
        return stringValue.toLowerCase(locale);
    }

    public String toLowerCase() {
        return stringValue.toLowerCase();
    }

    public String toUpperCase(Locale locale) {
        return stringValue.toUpperCase(locale);
    }

    public String toUpperCase() {
        return stringValue.toUpperCase();
    }

    public String trim() {
        return stringValue.trim();
    }

    public String strip() {
        return stringValue.strip();
    }

    public String stripLeading() {
        return stringValue.stripLeading();
    }

    public String stripTrailing() {
        return stringValue.stripTrailing();
    }

    public boolean isBlank() {
        return stringValue.isBlank();
    }

    public Stream<String> lines() {
        return stringValue.lines();
    }

    public IntStream chars() {
        return stringValue.chars();
    }

    public IntStream codePoints() {
        return stringValue.codePoints();
    }

    public char[] toCharArray() {
        return stringValue.toCharArray();
    }

    public String intern() {
        return stringValue.intern();
    }

    public String repeat(int count) {
        return stringValue.repeat(count);
    }

    public AddedClass() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public boolean isEmpty() {
        return stringValue.isEmpty();
    }

}
