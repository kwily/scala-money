package com.kwily.money

sealed abstract class Currency(val isoCode: String,
                               val isoNumber: String,
                               val name: String,
                               val minorUnit: Int,
                               val symbol: String,
)

object Currency {
  class AED extends Currency("AED", "784", "UAE Dirham", 2, "AED")
  class AFN extends Currency("AFN", "971", "Afghani", 2, "Af")
  class ALL extends Currency("ALL", "008", "Lek", 2, "L")
  class AMD extends Currency("AMD", "051", "Armenian Dram", 2, "Դ")
  class ANG extends Currency("ANG", "532", "Netherlands Antillean Guilder", 2, "ANG")
  class AOA extends Currency("AOA", "973", "Kwanza", 2, "Kz")
  class ARS extends Currency("ARS", "032", "Argentine Peso", 2, "$")
  class AUD extends Currency("AUD", "036", "Australian Dollar", 2, "$")
  class AWG extends Currency("AWG", "533", "Aruban Florin", 2, "ƒ")
  class AZN extends Currency("AZN", "944", "Azerbaijan Manat", 2, "ман")
  class BAM extends Currency("BAM", "977", "Convertible Mark", 2, "КМ")
  class BBD extends Currency("BBD", "052", "Barbados Dollar", 2, "$")
  class BDT extends Currency("BDT", "050", "Taka", 2, "৳")
  class BGN extends Currency("BGN", "975", "Bulgarian Lev", 2, "лв")
  class BHD extends Currency("BHD", "048", "Bahraini Dinar", 3, "ب.د")
  class BIF extends Currency("BIF", "108", "Burundi Franc", 0, "₣")
  class BMD extends Currency("BMD", "060", "Bermudian Dollar", 2, "$")
  class BND extends Currency("BND", "096", "Brunei Dollar", 2, "$")
  class BOB extends Currency("BOB", "068", "Boliviano", 2, "Bs.")
  class BOV extends Currency("BOV", "984", "Mvdol", 2, "BOV")
  class BRL extends Currency("BRL", "986", "Brazilian Real", 2, "R$")
  class BSD extends Currency("BSD", "044", "Bahamian Dollar", 2, "$")
  class BTN extends Currency("BTN", "064", "Ngultrum", 2, "")
  class BWP extends Currency("BWP", "072", "Pula", 2, "P")
  class BYN extends Currency("BYN", "933", "Belarusian Ruble", 2, "BYN")
  class BZD extends Currency("BZD", "084", "Belize Dollar", 2, "$")
  class CAD extends Currency("CAD", "124", "Canadian Dollar", 2, "$")
  class CDF extends Currency("CDF", "976", "Congolese Franc", 2, "₣")
  class CHE extends Currency("CHE", "947", "WIR Euro", 2, "CHE")
  class CHF extends Currency("CHF", "756", "Swiss Franc", 2, "₣")
  class CHW extends Currency("CHW", "948", "WIR Franc", 2, "CHW")
  class CLF extends Currency("CLF", "990", "Unidad de Fomento", 4, "CLF")
  class CLP extends Currency("CLP", "152", "Chilean Peso", 0, "$")
  class CNY extends Currency("CNY", "156", "Yuan Renminbi", 2, "¥")
  class COP extends Currency("COP", "170", "Colombian Peso", 2, "$")
  class COU extends Currency("COU", "970", "Unidad de Valor Real", 2, "COU")
  class CRC extends Currency("CRC", "188", "Costa Rican Colon", 2, "₡")
  class CUC extends Currency("CUC", "931", "Peso Convertible", 2, "CUC")
  class CUP extends Currency("CUP", "192", "Cuban Peso", 2, "$")
  class CVE extends Currency("CVE", "132", "Cabo Verde Escudo", 2, "$")
  class CZK extends Currency("CZK", "203", "Czech Koruna", 2, "Kč")
  class DJF extends Currency("DJF", "262", "Djibouti Franc", 0, "₣")
  class DKK extends Currency("DKK", "208", "Danish Krone", 2, "kr")
  class DOP extends Currency("DOP", "214", "Dominican Peso", 2, "$")
  class DZD extends Currency("DZD", "012", "Algerian Dinar", 2, "د.ج")
  class EGP extends Currency("EGP", "818", "Egyptian Pound", 2, "£")
  class ERN extends Currency("ERN", "232", "Nakfa", 2, "Nfk")
  class ETB extends Currency("ETB", "230", "Ethiopian Birr", 2, "")
  class EUR extends Currency("EUR", "978", "Euro", 2, "€")
  class FJD extends Currency("FJD", "242", "Fiji Dollar", 2, "$")
  class FKP extends Currency("FKP", "238", "Falkland Islands Pound", 2, "£")
  class GBP extends Currency("GBP", "826", "Pound Sterling", 2, "£")
  class GEL extends Currency("GEL", "981", "Lari", 2, "ლ")
  class GHS extends Currency("GHS", "936", "Ghana Cedi", 2, "₵")
  class GIP extends Currency("GIP", "292", "Gibraltar Pound", 2, "£")
  class GMD extends Currency("GMD", "270", "Dalasi", 2, "D")
  class GNF extends Currency("GNF", "324", "Guinean Franc", 0, "₣")
  class GTQ extends Currency("GTQ", "320", "Quetzal", 2, "Q")
  class GYD extends Currency("GYD", "328", "Guyana Dollar", 2, "$")
  class HKD extends Currency("HKD", "344", "Hong Kong Dollar", 2, "$")
  class HNL extends Currency("HNL", "340", "Lempira", 2, "L")
  class HRK extends Currency("HRK", "191", "Kuna", 2, "Kn")
  class HTG extends Currency("HTG", "332", "Gourde", 2, "G")
  class HUF extends Currency("HUF", "348", "Forint", 2, "Ft")
  class IDR extends Currency("IDR", "360", "Rupiah", 2, "Rp")
  class ILS extends Currency("ILS", "376", "New Israeli Sheqel", 2, "₪")
  class INR extends Currency("INR", "356", "Indian Rupee", 2, "₨")
  class IQD extends Currency("IQD", "368", "Iraqi Dinar", 3, "ع.د")
  class IRR extends Currency("IRR", "364", "Iranian Rial", 2, "﷼")
  class ISK extends Currency("ISK", "352", "Iceland Krona", 0, "Kr")
  class JMD extends Currency("JMD", "388", "Jamaican Dollar", 2, "$")
  class JOD extends Currency("JOD", "400", "Jordanian Dinar", 3, "د.ا")
  class JPY extends Currency("JPY", "392", "Yen", 0, "¥")
  class KES extends Currency("KES", "404", "Kenyan Shilling", 2, "Sh")
  class KGS extends Currency("KGS", "417", "Som", 2, "")
  class KHR extends Currency("KHR", "116", "Riel", 2, "៛")
  class KMF extends Currency("KMF", "174", "Comorian Franc ", 0, "KMF")
  class KPW extends Currency("KPW", "408", "North Korean Won", 2, "₩")
  class KRW extends Currency("KRW", "410", "Won", 0, "₩")
  class KWD extends Currency("KWD", "414", "Kuwaiti Dinar", 3, "د.ك")
  class KYD extends Currency("KYD", "136", "Cayman Islands Dollar", 2, "$")
  class KZT extends Currency("KZT", "398", "Tenge", 2, "〒")
  class LAK extends Currency("LAK", "418", "Lao Kip", 2, "₭")
  class LBP extends Currency("LBP", "422", "Lebanese Pound", 2, "ل.ل")
  class LKR extends Currency("LKR", "144", "Sri Lanka Rupee", 2, "Rs")
  class LRD extends Currency("LRD", "430", "Liberian Dollar", 2, "$")
  class LSL extends Currency("LSL", "426", "Loti", 2, "L")
  class LYD extends Currency("LYD", "434", "Libyan Dinar", 3, "ل.د")
  class MAD extends Currency("MAD", "504", "Moroccan Dirham", 2, "د.م.")
  class MDL extends Currency("MDL", "498", "Moldovan Leu", 2, "L")
  class MGA extends Currency("MGA", "969", "Malagasy Ariary", 2, "")
  class MKD extends Currency("MKD", "807", "Denar", 2, "ден")
  class MMK extends Currency("MMK", "104", "Kyat", 2, "K")
  class MNT extends Currency("MNT", "496", "Tugrik", 2, "₮")
  class MOP extends Currency("MOP", "446", "Pataca", 2, "P")
  class MRO extends Currency("MRO", "478", "Ouguiya", 2, "UM")
  class MUR extends Currency("MUR", "480", "Mauritius Rupee", 2, "₨")
  class MVR extends Currency("MVR", "462", "Rufiyaa", 2, "ރ.")
  class MWK extends Currency("MWK", "454", "Malawi Kwacha", 2, "MK")
  class MXN extends Currency("MXN", "484", "Mexican Peso", 2, "$")
  class MXV extends Currency("MXV", "979", "Mexican Unidad de Inversion (UDI)", 2, "MXV")
  class MYR extends Currency("MYR", "458", "Malaysian Ringgit", 2, "RM")
  class MZN extends Currency("MZN", "943", "Mozambique Metical", 2, "MTn")
  class NAD extends Currency("NAD", "516", "Namibia Dollar", 2, "$")
  class NGN extends Currency("NGN", "566", "Naira", 2, "₦")
  class NIO extends Currency("NIO", "558", "Cordoba Oro", 2, "C$")
  class NOK extends Currency("NOK", "578", "Norwegian Krone", 2, "kr")
  class NPR extends Currency("NPR", "524", "Nepalese Rupee", 2, "₨")
  class NZD extends Currency("NZD", "554", "New Zealand Dollar", 2, "$")
  class OMR extends Currency("OMR", "512", "Rial Omani", 3, "ر.ع.")
  class PAB extends Currency("PAB", "590", "Balboa", 2, "B/.")
  class PEN extends Currency("PEN", "604", "Sol", 2, "S/.")
  class PGK extends Currency("PGK", "598", "Kina", 2, "K")
  class PHP extends Currency("PHP", "608", "Philippine Piso", 2, "₱")
  class PKR extends Currency("PKR", "586", "Pakistan Rupee", 2, "₨")
  class PLN extends Currency("PLN", "985", "Zloty", 2, "zł")
  class PYG extends Currency("PYG", "600", "Guarani", 0, "₲")
  class QAR extends Currency("QAR", "634", "Qatari Rial", 2, "ر.ق")
  class RON extends Currency("RON", "946", "Romanian Leu", 2, "L")
  class RSD extends Currency("RSD", "941", "Serbian Dinar", 2, "din")
  class RUB extends Currency("RUB", "643", "Russian Ruble", 2, "р.")
  class RWF extends Currency("RWF", "646", "Rwanda Franc", 0, "₣")
  class SAR extends Currency("SAR", "682", "Saudi Riyal", 2, "ر.س")
  class SBD extends Currency("SBD", "090", "Solomon Islands Dollar", 2, "$")
  class SCR extends Currency("SCR", "690", "Seychelles Rupee", 2, "₨")
  class SDG extends Currency("SDG", "938", "Sudanese Pound", 2, "£")
  class SEK extends Currency("SEK", "752", "Swedish Krona", 2, "kr")
  class SGD extends Currency("SGD", "702", "Singapore Dollar", 2, "$")
  class SHP extends Currency("SHP", "654", "Saint Helena Pound", 2, "£")
  class SLL extends Currency("SLL", "694", "Leone", 2, "Le")
  class SOS extends Currency("SOS", "706", "Somali Shilling", 2, "Sh")
  class SRD extends Currency("SRD", "968", "Surinam Dollar", 2, "$")
  class SSP extends Currency("SSP", "728", "South Sudanese Pound", 2, "SSP")
  class STD extends Currency("STD", "678", "Dobra", 2, "Db")
  class SVC extends Currency("SVC", "222", "El Salvador Colon", 2, "SVC")
  class SYP extends Currency("SYP", "760", "Syrian Pound", 2, "ل.س")
  class SZL extends Currency("SZL", "748", "Lilangeni", 2, "L")
  class THB extends Currency("THB", "764", "Baht", 2, "฿")
  class TJS extends Currency("TJS", "972", "Somoni", 2, "ЅМ")
  class TMT extends Currency("TMT", "934", "Turkmenistan New Manat", 2, "m")
  class TND extends Currency("TND", "788", "Tunisian Dinar", 3, "د.ت")
  class TOP extends Currency("TOP", "776", "Pa’anga", 2, "T$")
  class TRY extends Currency("TRY", "949", "Turkish Lira", 2, "₤")
  class TTD extends Currency("TTD", "780", "Trinidad and Tobago Dollar", 2, "$")
  class TWD extends Currency("TWD", "901", "New Taiwan Dollar", 2, "$")
  class TZS extends Currency("TZS", "834", "Tanzanian Shilling", 2, "Sh")
  class UAH extends Currency("UAH", "980", "Hryvnia", 2, "₴")
  class UGX extends Currency("UGX", "800", "Uganda Shilling", 0, "Sh")
  class USD extends Currency("USD", "840", "US Dollar", 2, "$")
  class USN extends Currency("USN", "997", "US Dollar (Next day)", 2, "USN")
  class UYI extends Currency("UYI", "940", "Uruguay Peso en Unidades Indexadas (URUIURUI)", 0, "UYI")
  class UYU extends Currency("UYU", "858", "Peso Uruguayo", 2, "$")
  class UZS extends Currency("UZS", "860", "Uzbekistan Sum", 2, "")
  class VEF extends Currency("VEF", "937", "Bolívar", 2, "Bs F")
  class VND extends Currency("VND", "704", "Dong", 0, "₫")
  class VUV extends Currency("VUV", "548", "Vatu", 0, "Vt")
  class WST extends Currency("WST", "882", "Tala", 2, "T")
  class XAF extends Currency("XAF", "950", "CFA Franc BEAC", 0, "₣")
  class XAG extends Currency("XAG", "961", "Silver", 0, "XAG")
  class XAU extends Currency("XAU", "959", "Gold", 0, "XAU")
  class XBA extends Currency("XBA", "955", "Bond Markets Unit European Composite Unit (EURCO)", 0, "XBA")
  class XBB extends Currency("XBB", "956", "Bond Markets Unit European Monetary Unit (E.M.U.-6)", 0, "XBB")
  class XBC extends Currency("XBC", "957", "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)", 0, "XBC")
  class XBD extends Currency("XBD", "958", "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)", 0, "XBD")
  class XCD extends Currency("XCD", "951", "East Caribbean Dollar", 2, "$")
  class XDR extends Currency("XDR", "960", "SDR (Special Drawing Right)", 0, "XDR")
  class XOF extends Currency("XOF", "952", "CFA Franc BCEAO", 0, "XOF")
  class XPD extends Currency("XPD", "964", "Palladium", 0, "XPD")
  class XPF extends Currency("XPF", "953", "CFP Franc", 0, "₣")
  class XPT extends Currency("XPT", "962", "Platinum", 0, "XPT")
  class XSU extends Currency("XSU", "994", "Sucre", 0, "XSU")
  class XTS extends Currency("XTS", "963", "Codes specifically reserved for testing purposes", 0, "XTS")
  class XUA extends Currency("XUA", "965", "ADB Unit of Account", 0, "XUA")
  class XXX
      extends Currency("XXX", "999", "The codes assigned for transactions where no currency is involved", 0, "XXX")
  class YER extends Currency("YER", "886", "Yemeni Rial", 2, "﷼")
  class ZAR extends Currency("ZAR", "710", "Rand", 2, "R")
  class ZMW extends Currency("ZMW", "967", "Zambian Kwacha", 2, "ZK")
  class ZWL extends Currency("ZWL", "932", "Zimbabwe Dollar", 2, "$")

  def apply(iso: String): Currency =
    iso match {
      case "AED" | "784" => new AED
      case "AFN" | "971" => new AFN
      case "ALL" | "008" => new ALL
      case "AMD" | "051" => new AMD
      case "ANG" | "532" => new ANG
      case "AOA" | "973" => new AOA
      case "ARS" | "032" => new ARS
      case "AUD" | "036" => new AUD
      case "AWG" | "533" => new AWG
      case "AZN" | "944" => new AZN
      case "BAM" | "977" => new BAM
      case "BBD" | "052" => new BBD
      case "BDT" | "050" => new BDT
      case "BGN" | "975" => new BGN
      case "BHD" | "048" => new BHD
      case "BIF" | "108" => new BIF
      case "BMD" | "060" => new BMD
      case "BND" | "096" => new BND
      case "BOB" | "068" => new BOB
      case "BOV" | "984" => new BOV
      case "BRL" | "986" => new BRL
      case "BSD" | "044" => new BSD
      case "BTN" | "064" => new BTN
      case "BWP" | "072" => new BWP
      case "BYN" | "933" => new BYN
      case "BZD" | "084" => new BZD
      case "CAD" | "124" => new CAD
      case "CDF" | "976" => new CDF
      case "CHE" | "947" => new CHE
      case "CHF" | "756" => new CHF
      case "CHW" | "948" => new CHW
      case "CLF" | "990" => new CLF
      case "CLP" | "152" => new CLP
      case "CNY" | "156" => new CNY
      case "COP" | "170" => new COP
      case "COU" | "970" => new COU
      case "CRC" | "188" => new CRC
      case "CUC" | "931" => new CUC
      case "CUP" | "192" => new CUP
      case "CVE" | "132" => new CVE
      case "CZK" | "203" => new CZK
      case "DJF" | "262" => new DJF
      case "DKK" | "208" => new DKK
      case "DOP" | "214" => new DOP
      case "DZD" | "012" => new DZD
      case "EGP" | "818" => new EGP
      case "ERN" | "232" => new ERN
      case "ETB" | "230" => new ETB
      case "EUR" | "978" => new EUR
      case "FJD" | "242" => new FJD
      case "FKP" | "238" => new FKP
      case "GBP" | "826" => new GBP
      case "GEL" | "981" => new GEL
      case "GHS" | "936" => new GHS
      case "GIP" | "292" => new GIP
      case "GMD" | "270" => new GMD
      case "GNF" | "324" => new GNF
      case "GTQ" | "320" => new GTQ
      case "GYD" | "328" => new GYD
      case "HKD" | "344" => new HKD
      case "HNL" | "340" => new HNL
      case "HRK" | "191" => new HRK
      case "HTG" | "332" => new HTG
      case "HUF" | "348" => new HUF
      case "IDR" | "360" => new IDR
      case "ILS" | "376" => new ILS
      case "INR" | "356" => new INR
      case "IQD" | "368" => new IQD
      case "IRR" | "364" => new IRR
      case "ISK" | "352" => new ISK
      case "JMD" | "388" => new JMD
      case "JOD" | "400" => new JOD
      case "JPY" | "392" => new JPY
      case "KES" | "404" => new KES
      case "KGS" | "417" => new KGS
      case "KHR" | "116" => new KHR
      case "KMF" | "174" => new KMF
      case "KPW" | "408" => new KPW
      case "KRW" | "410" => new KRW
      case "KWD" | "414" => new KWD
      case "KYD" | "136" => new KYD
      case "KZT" | "398" => new KZT
      case "LAK" | "418" => new LAK
      case "LBP" | "422" => new LBP
      case "LKR" | "144" => new LKR
      case "LRD" | "430" => new LRD
      case "LSL" | "426" => new LSL
      case "LYD" | "434" => new LYD
      case "MAD" | "504" => new MAD
      case "MDL" | "498" => new MDL
      case "MGA" | "969" => new MGA
      case "MKD" | "807" => new MKD
      case "MMK" | "104" => new MMK
      case "MNT" | "496" => new MNT
      case "MOP" | "446" => new MOP
      case "MRO" | "478" => new MRO
      case "MUR" | "480" => new MUR
      case "MVR" | "462" => new MVR
      case "MWK" | "454" => new MWK
      case "MXN" | "484" => new MXN
      case "MXV" | "979" => new MXV
      case "MYR" | "458" => new MYR
      case "MZN" | "943" => new MZN
      case "NAD" | "516" => new NAD
      case "NGN" | "566" => new NGN
      case "NIO" | "558" => new NIO
      case "NOK" | "578" => new NOK
      case "NPR" | "524" => new NPR
      case "NZD" | "554" => new NZD
      case "OMR" | "512" => new OMR
      case "PAB" | "590" => new PAB
      case "PEN" | "604" => new PEN
      case "PGK" | "598" => new PGK
      case "PHP" | "608" => new PHP
      case "PKR" | "586" => new PKR
      case "PLN" | "985" => new PLN
      case "PYG" | "600" => new PYG
      case "QAR" | "634" => new QAR
      case "RON" | "946" => new RON
      case "RSD" | "941" => new RSD
      case "RUB" | "643" => new RUB
      case "RWF" | "646" => new RWF
      case "SAR" | "682" => new SAR
      case "SBD" | "090" => new SBD
      case "SCR" | "690" => new SCR
      case "SDG" | "938" => new SDG
      case "SEK" | "752" => new SEK
      case "SGD" | "702" => new SGD
      case "SHP" | "654" => new SHP
      case "SLL" | "694" => new SLL
      case "SOS" | "706" => new SOS
      case "SRD" | "968" => new SRD
      case "SSP" | "728" => new SSP
      case "STD" | "678" => new STD
      case "SVC" | "222" => new SVC
      case "SYP" | "760" => new SYP
      case "SZL" | "748" => new SZL
      case "THB" | "764" => new THB
      case "TJS" | "972" => new TJS
      case "TMT" | "934" => new TMT
      case "TND" | "788" => new TND
      case "TOP" | "776" => new TOP
      case "TRY" | "949" => new TRY
      case "TTD" | "780" => new TTD
      case "TWD" | "901" => new TWD
      case "TZS" | "834" => new TZS
      case "UAH" | "980" => new UAH
      case "UGX" | "800" => new UGX
      case "USD" | "840" => new USD
      case "USN" | "997" => new USN
      case "UYI" | "940" => new UYI
      case "UYU" | "858" => new UYU
      case "UZS" | "860" => new UZS
      case "VEF" | "937" => new VEF
      case "VND" | "704" => new VND
      case "VUV" | "548" => new VUV
      case "WST" | "882" => new WST
      case "XAF" | "950" => new XAF
      case "XAG" | "961" => new XAG
      case "XAU" | "959" => new XAU
      case "XBA" | "955" => new XBA
      case "XBB" | "956" => new XBB
      case "XBC" | "957" => new XBC
      case "XBD" | "958" => new XBD
      case "XCD" | "951" => new XCD
      case "XDR" | "960" => new XDR
      case "XOF" | "952" => new XOF
      case "XPD" | "964" => new XPD
      case "XPF" | "953" => new XPF
      case "XPT" | "962" => new XPT
      case "XSU" | "994" => new XSU
      case "XTS" | "963" => new XTS
      case "XUA" | "965" => new XUA
      case "XXX" | "999" => new XXX
      case "YER" | "886" => new YER
      case "ZAR" | "710" => new ZAR
      case "ZMW" | "967" => new ZMW
      case "ZWL" | "932" => new ZWL
    }
}
