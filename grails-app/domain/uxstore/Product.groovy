package uxstore

class Product {
    String name
    String description
    BigDecimal unitPrice
    String unitType
    String productMng
    String storeMng
    String shippingMng
    String packageMng
    String image1
    String image2
    String image3
    String category

    static constraints = {
        name(blank:false, nullable:false, unique: true)
        unitPrice(blank:false, nullable:false)
    }
    static mapping = {

    }
}

