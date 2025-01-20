package com.admin.catalog.domain.category;

import com.admin.catalog.domain.Identifier;

import java.util.UUID;

public class CategoryID extends Identifier {

    private final String value;

    private CategoryID(final String value){
        this.value = value;
    }

    public static CategoryID unique(){
        return CategoryID.from(UUID.randomUUID());
    }

    public static CategoryID from(final String anId){
        return new CategoryID(anId);
    }

    public static CategoryID from(final UUID anId){
        return new CategoryID(anId.toString().toLowerCase());
    }
}
