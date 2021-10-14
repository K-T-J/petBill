package petbill.search.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searchAjax/*")
public class SearchAjaxController {
	
	@Autowired
	private SearchServiceImpl searchService = null;
	
//	@RequestMapping("getSiList.pet")
//	public Map<String, Object> getSiList(String sidoSel, String pageNum) throws SQLException {
//		System.out.println("sidoSel" + sidoSel);
//		System.out.println("pageNum" + pageNum);
//		
		// 해당 페이지에 맞는 화면에 뿌려줄 병원 list 가져와 view에 전달 
//		Map<String, Object> data = searchService.getSidoSelHosList(sidoSel, pageNum);
		
		// view에 전달할 데이터 보내기 
//		model.addAttribute("pageSize", result.get("pageSize"));
//		model.addAttribute("pageNum", result.get("pageNum"));
//		model.addAttribute("currentPage", result.get("currentPage"));
//		model.addAttribute("startRow", result.get("startRow"));
//		model.addAttribute("endRow", result.get("endRow"));
//		model.addAttribute("hosSidoSelList", result.get("hosSidoSelList"));
//		model.addAttribute("count", result.get("count"));
//		model.addAttribute("number", result.get("number"));
//		model.addAttribute("sidoSel", result.get("sidoSel"));
		
//		List list = new ArrayList();
//		list.add(result);
//		list.add(result.get("pageSize"));
//		list.add(result.get("pageNum"));
//		list.add(result.get("currentPage"));
//		list.add(result.get("startRow"));
//		list.add(result.get("endRow"));
//		list.add(result.get("hosSidoSelList"));
//		list.add(result.get("count"));
//		list.add(result.get("number"));
//		list.add(result.get("sidoSel"));
		
//		return data;
//	}
	
	
}
