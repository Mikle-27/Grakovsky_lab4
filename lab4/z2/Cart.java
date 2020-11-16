package ru.mirea.gib04.lab4.z2;

class Cart
{
    int cartTotal = 0;

    void increaseTotal(Priceable priceable)
    {
        cartTotal += priceable.getPrice();
    }
}