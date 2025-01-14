package com.lzy.shan.restaurant.controller.clientController;

import com.lzy.shan.restaurant.entity.CustomPageInfo;
import com.lzy.shan.restaurant.entity.Order;
import com.lzy.shan.restaurant.entity.OrderDetail;
import com.lzy.shan.restaurant.entity.Result;
import com.lzy.shan.restaurant.service.OrderDetailService;
import com.lzy.shan.restaurant.service.OrderService;
import com.lzy.shan.restaurant.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/guest/client")
public class ClientOrderController{
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailService orderDetailService;
    /**
     * 添加订单
     * @return
     */
    @PostMapping("/addorder.do")
    @ResponseBody
    private Result addOrder(@RequestBody Order order){
        String orderCode = orderService.addOrder(order);
        return ResultUtil.success(orderCode);
    }

    @GetMapping("/myOrder.do")
    @ResponseBody
    private Result<OrderDetail> myOrder(CustomPageInfo info,Order order){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrder(order);
        info.setT(orderDetail);
        CustomPageInfo<OrderDetail> resultInfo =  orderDetailService.findPage(info);
        System.out.println(resultInfo.getList());
        return ResultUtil.success(resultInfo.getList(),resultInfo.getTotal());
    }

    @GetMapping("/myOrder.html")
    public String viewOrderDetail(@RequestParam("orderCode") String orderCode, Model model){
        model.addAttribute("orderCode",orderCode);
        return "/client/myOrder";
    }

    @PostMapping("/delGood.do")
    @ResponseBody
    public Result<OrderDetail> deleteByOrderDetailIds(@RequestParam("ids") String ids){
        orderDetailService.deleteByIds(ids);
        return ResultUtil.success();
    }
}
