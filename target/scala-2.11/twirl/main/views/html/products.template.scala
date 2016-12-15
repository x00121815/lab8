
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.34*/("""
"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">
        <table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
            """),_display_(/*26.14*/for(p <- products) yield /*26.32*/ {_display_(Seq[Any](format.raw/*26.34*/("""
		"""),format.raw/*27.3*/("""<tr>
			<td class="numeric">"""),_display_(/*28.25*/p/*28.26*/.getId),format.raw/*28.32*/("""</td>
			<td>"""),_display_(/*29.9*/p/*29.10*/.getName),format.raw/*29.18*/("""</td>
			<td>"""),_display_(/*30.9*/p/*30.10*/.getDescription),format.raw/*30.25*/("""</td>
			<td class="numeric">"""),_display_(/*31.25*/p/*31.26*/.getStock),format.raw/*31.35*/("""</td>
			<td class="numeric">&euro; """),_display_(/*32.32*/("%.2f".format(p.getPrice))),format.raw/*32.59*/("""</td>
		</tr>
	    """)))}),format.raw/*34.7*/("""
          """),format.raw/*35.11*/("""</tbody>
        </table>
      </div>
  </div>
  <!-- End of content for main -->
""")))}),format.raw/*40.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 17:32:48 GMT 2016
                  SOURCE: /home/wdd/webapps/Lab-8/app/views/products.scala.html
                  HASH: 55123e01ed198b29bcabf2594faf41d878f1c24e
                  MATRIX: 765->2|892->34|919->35|979->68|1007->69|1053->88|1081->89|1109->90|1156->112|1180->128|1219->130|1248->133|1858->716|1892->734|1932->736|1962->739|2018->768|2028->769|2055->775|2095->789|2105->790|2134->798|2174->812|2184->813|2220->828|2277->858|2287->859|2317->868|2381->905|2429->932|2479->952|2518->963|2632->1047
                  LINES: 27->2|32->2|33->3|33->3|33->3|33->3|33->3|33->3|34->4|34->4|34->4|35->5|56->26|56->26|56->26|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|64->34|65->35|70->40
                  -- GENERATED --
              */
          