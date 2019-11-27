package be.intecbrussel.classiccars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;
import java.util.Objects;

@Entity
@Table(name = "productlines")
public class ProductLine {

    @Id
    private String productLine;

    private String textDescription;
    @Column(name = "htmlDescription", columnDefinition = "mediumtext")
    private String htmlDescription;
@Column(columnDefinition = "mediumblob")
    private Blob image;

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ProductLine{" +
                "productLine='" + productLine + '\'' +
                ", textDescription='" + textDescription + '\'' +
                ", htmlDescription='" + htmlDescription + '\'' +
                ", image=" + image +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductLine that = (ProductLine) o;
        return productLine.equals(that.productLine) &&
                Objects.equals(textDescription, that.textDescription) &&
                Objects.equals(htmlDescription, that.htmlDescription) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productLine, textDescription, htmlDescription, image);
    }
}
