//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.09 at 05:29:41 PM CEST 
//


package _Aufgabe4;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _Aufgabe4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _Aufgabe4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Kochbuch }
     * 
     */
    public Kochbuch createKochbuch() {
        return new Kochbuch();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept }
     * 
     */
    public Kochbuch.Rezept createKochbuchRezept() {
        return new Kochbuch.Rezept();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept.Comments }
     * 
     */
    public Kochbuch.Rezept.Comments createKochbuchRezeptComments() {
        return new Kochbuch.Rezept.Comments();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept.Comments.Comment }
     * 
     */
    public Kochbuch.Rezept.Comments.Comment createKochbuchRezeptCommentsComment() {
        return new Kochbuch.Rezept.Comments.Comment();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept.Zutaten }
     * 
     */
    public Kochbuch.Rezept.Zutaten createKochbuchRezeptZutaten() {
        return new Kochbuch.Rezept.Zutaten();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept.Pictures }
     * 
     */
    public Kochbuch.Rezept.Pictures createKochbuchRezeptPictures() {
        return new Kochbuch.Rezept.Pictures();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept.Zubereitung }
     * 
     */
    public Kochbuch.Rezept.Zubereitung createKochbuchRezeptZubereitung() {
        return new Kochbuch.Rezept.Zubereitung();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept.Comments.Comment.User }
     * 
     */
    public Kochbuch.Rezept.Comments.Comment.User createKochbuchRezeptCommentsCommentUser() {
        return new Kochbuch.Rezept.Comments.Comment.User();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept.Zutaten.Zutat }
     * 
     */
    public Kochbuch.Rezept.Zutaten.Zutat createKochbuchRezeptZutatenZutat() {
        return new Kochbuch.Rezept.Zutaten.Zutat();
    }

    /**
     * Create an instance of {@link Kochbuch.Rezept.Pictures.Pic }
     * 
     */
    public Kochbuch.Rezept.Pictures.Pic createKochbuchRezeptPicturesPic() {
        return new Kochbuch.Rezept.Pictures.Pic();
    }

}