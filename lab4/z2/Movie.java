package ru.mirea.gib04.lab4.z2;

class Movie implements Priceable{
    int price = 45;

    @Override
    public int getPrice()
    {
        return price;
    }
}