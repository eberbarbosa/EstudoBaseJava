/*
 *  29/01/2024
 * - pagina 53 livro: Java Efetivo - Joshua Bloch
 *  Estudo da classe Object
 *  
 */
package EstudoClasseObject.JavaEfetivo_Cap3;

/**
 *
 * @author eber
 */
public final class PhoneNumber {
    
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix   = rangeCheck(prefix,   999, "prefix");
        this.lineNum  = rangeCheck(lineNum, 9999, "line num");
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNum() {
        return lineNum;
    }   
    
    
    
    private static short rangeCheck(int val, int max, String arg) {
        
        if(val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        
        return (short) val;
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.areaCode;
        hash = 31 * hash + this.prefix;
        hash = 31 * hash + this.lineNum;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "areaCode=" + areaCode + ", prefix=" + prefix + ", lineNum=" + lineNum + '}';
    }
    
    
    
    
    
    
    
}
