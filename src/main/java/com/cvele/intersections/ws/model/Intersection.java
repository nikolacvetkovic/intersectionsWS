
package com.cvele.intersections.ws.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Intersection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Intersection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xcoordinate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ycoordinate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="e" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="f" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="g" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="h" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="i" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creation_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="k" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="l" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="m" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="n" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="o" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="p" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="r" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="s" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="t" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="u" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aab" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aabb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aabbb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aabbbb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ba" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="baa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="baaa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="baaaa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cbb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cbbb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cbbbb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dcc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dccc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dcccc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="edd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="eddd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="edddd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@Table(name = "intersection")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intersection", propOrder = {
    "id",
    "symbol",
    "title",
    "xcoordinate",
    "ycoordinate",
    "a",
    "b",
    "c",
    "d",
    "e",
    "f",
    "g",
    "h",
    "i",
    "creationTime",
    "k",
    "l",
    "m",
    "n",
    "o",
    "p",
    "r",
    "s",
    "t",
    "u",
    "aab",
    "aabb",
    "aabbb",
    "aabbbb",
    "ba",
    "baa",
    "baaa",
    "baaaa",
    "cb",
    "cbb",
    "cbbb",
    "cbbbb",
    "dc",
    "dcc",
    "dccc",
    "dcccc",
    "ed",
    "edd",
    "eddd",
    "edddd"
})
public class Intersection implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected int symbol;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected BigDecimal xcoordinate;
    @XmlElement(required = true)
    protected BigDecimal ycoordinate;
    @XmlElement(required = true)
    protected String a;
    @XmlElement(required = true)
    protected String b;
    protected int c;
    @XmlElement(required = true)
    protected String d;
    @XmlElement(required = true)
    protected String e;
    protected int f;
    @XmlElement(required = true)
    protected String g;
    @XmlElement(required = true)
    protected BigDecimal h;
    @XmlElement(required = true)
    protected String i;
    @XmlElement(name = "creation_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date creationTime;
    @XmlElement(required = true)
    protected String k;
    protected int l;
    @XmlElement(required = true)
    protected String m;
    protected int n;
    protected int o;
    protected int p;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int aab;
    protected int aabb;
    protected int aabbb;
    protected int aabbbb;
    protected int ba;
    protected int baa;
    protected int baaa;
    protected int baaaa;
    protected int cb;
    protected int cbb;
    protected int cbbb;
    protected int cbbbb;
    protected int dc;
    protected int dcc;
    protected int dccc;
    protected int dcccc;
    protected int ed;
    protected int edd;
    protected int eddd;
    protected int edddd;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     */
    public int getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     */
    public void setSymbol(int value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the xcoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXcoordinate() {
        return xcoordinate;
    }

    /**
     * Sets the value of the xcoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXcoordinate(BigDecimal value) {
        this.xcoordinate = value;
    }

    /**
     * Gets the value of the ycoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYcoordinate() {
        return ycoordinate;
    }

    /**
     * Sets the value of the ycoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYcoordinate(BigDecimal value) {
        this.ycoordinate = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA(String value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB(String value) {
        this.b = value;
    }

    /**
     * Gets the value of the c property.
     * 
     */
    public int getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     */
    public void setC(int value) {
        this.c = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD(String value) {
        this.d = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE(String value) {
        this.e = value;
    }

    /**
     * Gets the value of the f property.
     * 
     */
    public int getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     */
    public void setF(int value) {
        this.f = value;
    }

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG(String value) {
        this.g = value;
    }

    /**
     * Gets the value of the h property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setH(BigDecimal value) {
        this.h = value;
    }

    /**
     * Gets the value of the i property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI() {
        return i;
    }

    /**
     * Sets the value of the i property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI(String value) {
        this.i = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(Date value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setK(String value) {
        this.k = value;
    }

    /**
     * Gets the value of the l property.
     * 
     */
    public int getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     */
    public void setL(int value) {
        this.l = value;
    }

    /**
     * Gets the value of the m property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM(String value) {
        this.m = value;
    }

    /**
     * Gets the value of the n property.
     * 
     */
    public int getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     */
    public void setN(int value) {
        this.n = value;
    }

    /**
     * Gets the value of the o property.
     * 
     */
    public int getO() {
        return o;
    }

    /**
     * Sets the value of the o property.
     * 
     */
    public void setO(int value) {
        this.o = value;
    }

    /**
     * Gets the value of the p property.
     * 
     */
    public int getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     */
    public void setP(int value) {
        this.p = value;
    }

    /**
     * Gets the value of the r property.
     * 
     */
    public int getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     */
    public void setR(int value) {
        this.r = value;
    }

    /**
     * Gets the value of the s property.
     * 
     */
    public int getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     */
    public void setS(int value) {
        this.s = value;
    }

    /**
     * Gets the value of the t property.
     * 
     */
    public int getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     */
    public void setT(int value) {
        this.t = value;
    }

    /**
     * Gets the value of the u property.
     * 
     */
    public int getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     */
    public void setU(int value) {
        this.u = value;
    }

    /**
     * Gets the value of the aab property.
     * 
     */
    public int getAab() {
        return aab;
    }

    /**
     * Sets the value of the aab property.
     * 
     */
    public void setAab(int value) {
        this.aab = value;
    }

    /**
     * Gets the value of the aabb property.
     * 
     */
    public int getAabb() {
        return aabb;
    }

    /**
     * Sets the value of the aabb property.
     * 
     */
    public void setAabb(int value) {
        this.aabb = value;
    }

    /**
     * Gets the value of the aabbb property.
     * 
     */
    public int getAabbb() {
        return aabbb;
    }

    /**
     * Sets the value of the aabbb property.
     * 
     */
    public void setAabbb(int value) {
        this.aabbb = value;
    }

    /**
     * Gets the value of the aabbbb property.
     * 
     */
    public int getAabbbb() {
        return aabbbb;
    }

    /**
     * Sets the value of the aabbbb property.
     * 
     */
    public void setAabbbb(int value) {
        this.aabbbb = value;
    }

    /**
     * Gets the value of the ba property.
     * 
     */
    public int getBa() {
        return ba;
    }

    /**
     * Sets the value of the ba property.
     * 
     */
    public void setBa(int value) {
        this.ba = value;
    }

    /**
     * Gets the value of the baa property.
     * 
     */
    public int getBaa() {
        return baa;
    }

    /**
     * Sets the value of the baa property.
     * 
     */
    public void setBaa(int value) {
        this.baa = value;
    }

    /**
     * Gets the value of the baaa property.
     * 
     */
    public int getBaaa() {
        return baaa;
    }

    /**
     * Sets the value of the baaa property.
     * 
     */
    public void setBaaa(int value) {
        this.baaa = value;
    }

    /**
     * Gets the value of the baaaa property.
     * 
     */
    public int getBaaaa() {
        return baaaa;
    }

    /**
     * Sets the value of the baaaa property.
     * 
     */
    public void setBaaaa(int value) {
        this.baaaa = value;
    }

    /**
     * Gets the value of the cb property.
     * 
     */
    public int getCb() {
        return cb;
    }

    /**
     * Sets the value of the cb property.
     * 
     */
    public void setCb(int value) {
        this.cb = value;
    }

    /**
     * Gets the value of the cbb property.
     * 
     */
    public int getCbb() {
        return cbb;
    }

    /**
     * Sets the value of the cbb property.
     * 
     */
    public void setCbb(int value) {
        this.cbb = value;
    }

    /**
     * Gets the value of the cbbb property.
     * 
     */
    public int getCbbb() {
        return cbbb;
    }

    /**
     * Sets the value of the cbbb property.
     * 
     */
    public void setCbbb(int value) {
        this.cbbb = value;
    }

    /**
     * Gets the value of the cbbbb property.
     * 
     */
    public int getCbbbb() {
        return cbbbb;
    }

    /**
     * Sets the value of the cbbbb property.
     * 
     */
    public void setCbbbb(int value) {
        this.cbbbb = value;
    }

    /**
     * Gets the value of the dc property.
     * 
     */
    public int getDc() {
        return dc;
    }

    /**
     * Sets the value of the dc property.
     * 
     */
    public void setDc(int value) {
        this.dc = value;
    }

    /**
     * Gets the value of the dcc property.
     * 
     */
    public int getDcc() {
        return dcc;
    }

    /**
     * Sets the value of the dcc property.
     * 
     */
    public void setDcc(int value) {
        this.dcc = value;
    }

    /**
     * Gets the value of the dccc property.
     * 
     */
    public int getDccc() {
        return dccc;
    }

    /**
     * Sets the value of the dccc property.
     * 
     */
    public void setDccc(int value) {
        this.dccc = value;
    }

    /**
     * Gets the value of the dcccc property.
     * 
     */
    public int getDcccc() {
        return dcccc;
    }

    /**
     * Sets the value of the dcccc property.
     * 
     */
    public void setDcccc(int value) {
        this.dcccc = value;
    }

    /**
     * Gets the value of the ed property.
     * 
     */
    public int getEd() {
        return ed;
    }

    /**
     * Sets the value of the ed property.
     * 
     */
    public void setEd(int value) {
        this.ed = value;
    }

    /**
     * Gets the value of the edd property.
     * 
     */
    public int getEdd() {
        return edd;
    }

    /**
     * Sets the value of the edd property.
     * 
     */
    public void setEdd(int value) {
        this.edd = value;
    }

    /**
     * Gets the value of the eddd property.
     * 
     */
    public int getEddd() {
        return eddd;
    }

    /**
     * Sets the value of the eddd property.
     * 
     */
    public void setEddd(int value) {
        this.eddd = value;
    }

    /**
     * Gets the value of the edddd property.
     * 
     */
    public int getEdddd() {
        return edddd;
    }

    /**
     * Sets the value of the edddd property.
     * 
     */
    public void setEdddd(int value) {
        this.edddd = value;
    }

}
