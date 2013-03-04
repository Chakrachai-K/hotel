package team08

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class RegMemberComposer extends GrailsComposer {

    def afterCompose = { window ->
        // initialize components here

        $('#x1').on('click',{
            $('#qua').setOpen(false)
            $('#normal').setOpen(true)
        })

        $('#x2').on('click',{
            $('#vip').setOpen(true)
            $('#qua').setOpen(false)
            $('#normal').setOpen(false)
        })

        $('#back').on('click',{            
            $('#vip').setOpen(false)
            $('#qua').setOpen(true)
            $('#normal').setOpen(false)

                $('#fname').setValue("")
                $('#mname').setValue("")
                $('#lname').setValue("")
                $('#sex').setText("")
                $('#born').setText("")
                $('#age').setText("")
                $('#nationality').setText("")
                $('#idCityzen').setText("")
                $('#address').setText("")
                $('#emailAddress').setText("")
                $('#telNo').setText("")
        })

        $('#xback').on('click',{            
            $('#vip').setOpen(false)
            $('#qua').setOpen(true)
            $('#normal').setOpen(false)
        })

        $('#regnBtn').on('click',{            
            def cfname = $('#fname')[0].text
            def cmname = $('#mname')[0].text
            def clname = $('#lname')[0].text
            def cgender = $('#sex')[0].text
            def cborn = $('#born')[0].text
            def cage = $('#age')[0].text
            def cnationality = $('#nationality')[0].text
            def cidCityzen = $('#idCityzen')[0].text
            def caddress = $('#address')[0].text
            def cemailAddress = $('#emailAddress')[0].text
            def ctelNo = $('#telNo')[0].text

            def cmemberId = "NORM"+cfname+"ALX05D"
            def cmemberType = "VIP CUSTOMER"
            def fin = MemberCustomer.findAll()


            if(cfname.size()==0||clname.size()==0||cgender.size()==0||cborn.size()==0||cage.size()==0||cnationality.size()==0||cidCityzen.size()==0||caddress.size()==0||cemailAddress.size()==0||ctelNo.size()==0||cidCityzen.size()!=13){
                alert("กรุณากรอกให้ครบถ้วนและถูกต้อง")

                           
            }
            else {
                new MemberCustomer(
                     fName:cfname,            
                     mName:cmname,           
                     lName:clname,            
                     gender:cgender,          
                     born:cborn,             
                     age:cage,
                     nationality:cnationality,      
                     idCityzen:cidCityzen,       
                     address:caddress,          
                     emailAddress:cemailAddress,     
                     memberId:cmemberId,         
                     memberType:cmemberType,       
                     telNo:ctelNo
                    ).save()

                alert("ท่านได้สมัครสมาชิก VIP เรียบร้อยแล้ว")
                $('#fname').setValue("")
                $('#mname').setValue("")
                $('#lname').setValue("")
                $('#sex').setText("")
                $('#born').setText("")
                $('#age').setText("")
                $('#nationality').setText("")
                $('#idCityzen').setText("")
                $('#address').setText("")
                $('#emailAddress').setText("")
                $('#telNo').setText("")
            }

        })


    }
}
