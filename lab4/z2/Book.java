package ru.mirea.gib04.lab4.z2;

class Book implements Priceable
{
    int royalty = 10;
    int markup = 20;

    @Override
    public int getPrice()
    {
        return royalty + markup;
    }
}