package OOP

fun main() {
    val list= ListView(arrayOf("Mark","Oscar","Steve","Johns","Stella"))
    var itemInfo=list.ListViewItem().getLstItem(2);

}
class ListView(val listItems: Array<String>){

    inner class ListViewItem(){
        fun getLstItem( position: Int){
            println("Item at position $position is ${listItems[position]}")
        }
    }
}