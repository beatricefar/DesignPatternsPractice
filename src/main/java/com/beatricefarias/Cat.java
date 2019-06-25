package com.beatricefarias;

import com.sun.istack.internal.NotNull;


public class Cat {

    private String name;
    private int age;
    private CatBreed breed;
    private CatFurColor furColor;
    private CatPersonality personality;

    private Cat(
            @NotNull String name,
            @NotNull int age,
            @NotNull CatBreed breed,
            @NotNull CatFurColor furColor,
            @NotNull CatPersonality personality
    ) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.furColor = furColor;
        this.personality = personality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public CatBreed getBreed() {
        return breed;
    }

    public CatFurColor getFurColor() {
        return furColor;
    }


    public CatPersonality getPersonality() {
        return personality;
    }

    public static class Builder {

        private String name = "Unknown";
        private int age = -1;
        private CatBreed breed = CatBreed.UNKNOWN;
        private CatFurColor furColor = CatFurColor.UNKNOWN;
        private CatPersonality personality = CatPersonality.UNKNOWN;


        public Builder setName(@NotNull String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(@NotNull int age) {
            this.age = age;
            return this;
        }

        public Builder setBreed(@NotNull CatBreed breed) {
            this.breed = breed;
            return this;
        }

        public Builder setFurColor(@NotNull CatFurColor furColor) {
            this.furColor = furColor;
            return this;
        }

        public Builder setPersonality(@NotNull CatPersonality personality) {
            this.personality = personality;
            return this;
        }

        public Cat build() {
            return new Cat(name, age, breed, furColor, personality);
        }
    }

}
