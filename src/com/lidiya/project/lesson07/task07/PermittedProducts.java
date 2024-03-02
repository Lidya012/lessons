package com.lidiya.project.lesson07.task07;

public class PermittedProducts {
    private double max_proteins = 8.0;
    private  double max_fats =3.0 ;
    private double max_carbohydrates = 12.0;
    private double max_calories= 30;
    private Product product;
            public PermittedProducts(){

            }
            public  PermittedProducts(Product product){
                this.product = product;
            }
            public boolean checkProduct (Product product ){
                if((product.getProteins()>max_proteins)||
                        (product.getFats()>max_fats)||
                        (product.getCarbohydrates()>max_carbohydrates)||
                        (product.getCalories()> max_calories)) {
                    return false;
                }
                 else {
                    return true;
                }
            }


    public double getMax_proteins() {
        return max_proteins;
    }

    public double getMax_fats() {
        return max_fats;
    }

    public double getMax_carbohydrates() {
        return max_carbohydrates;
    }

    public double getMax_calories() {
        return max_calories;
    }
}
