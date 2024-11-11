class A{
    fun test() : Unit {

    }

}
class Transaction{
    class Deposit(val clientId : Int,val currencyKey : String, val amount : Double)
    class Withdraw(val clientId : Int,val currencyKey : String, val amount : Double)
    class ExchangeCurrency(val clientId : Int,val fromCurrencyKey : String,val toCurrencyKey : String, val amount : Double)
    class TransferFunds(val fromClientId : Int,val toClientId : Int,val currencyKey : String, val amount : Double)
}
