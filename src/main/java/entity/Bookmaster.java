/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author NENCY
 */
@Entity
@Table(name = "bookmaster")
@NamedQueries({
    @NamedQuery(name = "Bookmaster.findAll", query = "SELECT b FROM Bookmaster b"),
    @NamedQuery(name = "Bookmaster.findByBookId", query = "SELECT b FROM Bookmaster b WHERE b.bookId = :bookId"),
    @NamedQuery(name = "Bookmaster.findByBookName", query = "SELECT b FROM Bookmaster b WHERE b.bookName = :bookName"),
    @NamedQuery(name = "Bookmaster.findByAuthor", query = "SELECT b FROM Bookmaster b WHERE b.author = :author"),
    @NamedQuery(name = "Bookmaster.findByRate", query = "SELECT b FROM Bookmaster b WHERE b.rate = :rate"),
    @NamedQuery(name = "Bookmaster.findByBookCategory", query = "SELECT b FROM Bookmaster b WHERE b.bookCategory = :bookCategory"),
    @NamedQuery(name = "Bookmaster.findByStatus", query = "SELECT b FROM Bookmaster b WHERE b.status = :status"),
    @NamedQuery(name = "Bookmaster.findByPhoto", query = "SELECT b FROM Bookmaster b WHERE b.photo = :photo")})
public class Bookmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookId")
    private Integer bookId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "bookName")
    private String bookName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "author")
    private String author;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rate")
    private int rate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "bookCategory")
    private String bookCategory;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "photo")
    private String photo;

    public Bookmaster() {
    }

    public Bookmaster(Integer bookId) {
        this.bookId = bookId;
    }

    public Bookmaster(Integer bookId, String bookName, String author, int rate, String bookCategory, String status, String photo) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.rate = rate;
        this.bookCategory = bookCategory;
        this.status = status;
        this.photo = photo;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookmaster)) {
            return false;
        }
        Bookmaster other = (Bookmaster) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bookmaster[ bookId=" + bookId + " ]";
    }
    
}
