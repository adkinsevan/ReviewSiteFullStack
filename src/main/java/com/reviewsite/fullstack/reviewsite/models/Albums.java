package com.reviewsite.fullstack.reviewsite.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Albums {
        @Id
        @GeneratedValue
        private long id;
        private String albumName;
        @OneToMany
        private Collection<Reviews> reviews;
        @ManyToOne
        private Categories categories;

        protected Albums(){
        }

        public Albums(String albumName, Categories categories){
            this.albumName = albumName;
            this.categories = categories;
        }

        public long getId(){
            return id;
        }
        public String getAlbumName(){
            return albumName;
        }
        public Categories getCategories(){
            return categories;
        }
        public Collection<Reviews> getReviews(){
            return reviews;
        }
 }
