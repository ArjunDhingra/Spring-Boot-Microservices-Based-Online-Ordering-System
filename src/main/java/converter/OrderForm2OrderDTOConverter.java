package converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.form.OrderForm;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class OrderForm2OrderDTOConverter {
	
//	@Autowired
	private static Logger log;

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
             orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        }catch(Exception e){
            log.error("item wrong,string={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAMETER_ERROR);
        }
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
