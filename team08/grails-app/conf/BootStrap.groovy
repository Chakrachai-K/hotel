import team08.*

class BootStrap {

    def init = { servletContext ->

    	def p1 = new MemberCustomer(fName:"Customer1",mName:"",lName:"LCustomer1",gender:"M",born:"Thai",age:"35",nationality:"Thai",idCityzen:"1111111111111",address:"OnTheRoad",emailAddress:"aaa@a.com",memberId:"C1234",memberType:"VIP",telNo:"0000000").save()

		def e1 = new Employee(nameem:"Employee1",classem:"Cashier",idem:"E1234",statusem:"I Don't No",lnameem:"LEmployee",tel:"020000000",address:"Home",numaddress:"111",district:"Mairu",subdistrict:"lum",province:"Nakhonratchima",nprovince:"3000000",idppem:"1111111111",ageem:"30",passem:"12234").save()

		def re1 = new MakeEvent(employee:e1,customer:p1,typere:"Carnival",pricere:"250000",datere:"23/3/2556").save()
		def data1 = new DataSignIn(id:"1",datainput:"").save()
		def data2 = new DataSignIn(id:"2",datainput:"").save()
    }
    def destroy = {
    }
}
