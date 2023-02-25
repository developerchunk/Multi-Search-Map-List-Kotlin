fun main(args: Array<String>) {

    val other = "Other"

    val subCategory = mapOf(
        "Food" to listOf(
            "Breakfast",
            "Lunch",
            "Dinner",
            "Desert",
            "Fruits",
            "Meal",
            "Fast Food",
            "Salad",
            "Snacks"
        ),
        "Beverage" to listOf(
            "Ice-Cream",
            "Water Bottle",
            "Juice",
            "Coffee",
            "Tea",
            "Soft-Drink",
            "Hard-Drink",
        ),
        "Education" to listOf(
            "Book",
            "Software",
            "Stationary",
            "Equipment",
        ),
        "Rent" to listOf(
            "House",
            "Shop",
            "Office",
            "Paying Guest",
            "Vehicles",
            "Ware House",
            "Land",
            "Assets",
            "Plant & Machinery"
        ),
        "Bill" to listOf(
            "Credit Card Bill",
            "DTS Recharge",
            "Mobile Recharge",
            "Electricity Bill",
            "Water Bill",
            "Gas Bill",
            "Wages",
            "OTT Platform Bill"
        ),
        "Fee" to listOf(
            "School",
            "College",
            "Course",
            "Classes",
            "Hostel",
        ),
        "Transaction" to listOf(
            "Bank",
            "Cash",
            "UPI",
            "Card",
            "Net Banking",
            "Online Wallet",
        ),
        "Investment" to listOf(
            "Mutual Funds",
            "Stocks",
            "Policies",
            "SIP",
            "ETFs",
            "Fixed Deposit",
            "Bonds",
            "Real Estate",
            "Gold",
            "Project",
            "Digital Currency"
        ),
        other to listOf(
            other
        ),
    ).toSortedMap()

    val search = "Bill,Food"

    val categories = search.split(",")

    val newCategories = subCategory.filter { map ->
        categories.contains(map.key)
    }.mapListToList()

    loop(10)

    println(
        newCategories
    )

    loop(5)

    println(
        subCategory
    )

}

fun Map<String, List<String>>.mapListToList(): List<String> {

    val list = mutableListOf<String>()

    this.values.forEach {
        it.forEach { str ->
            list.add(str)
        }
    }

    return list.sorted()

}

fun loop(
    n: Int
) {

    (0..n).forEach { _ ->
        println(".")
    }

}