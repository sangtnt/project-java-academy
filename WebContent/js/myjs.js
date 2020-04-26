$(document).ready(function(){
	$(".edit").change(function(){
		$(".btn-save").show();
	});
	$(".oldpass").change(function(){
		if ($(".oldpass").val()===$(".password").text()){
			$(".mess1").text("");
		}
		else{
			$(".mess1").text("Password is wrong!");
			$(".oldpass").val("");
		}
	})
	$(".newpass").change(function(){
		if ($(".newpass").val()===$(".new1").val()){
			$(".mess").text("");
		}
		else{
			$(".mess").text("New password must be same");
			$(".newpass").val("");
		}
	})
	$(".add").click(function(){
		$(".fadd").show();
		$(".add").hide();
	})
	$(".cadd").click(function(){
		$(".fadd").hide();
		$(".add").show();
	})
	$(".words").click(function(){
		$(".meaning").fadeIn();
		$(".words").hide();
	})
	$(".meaning").click(function(){
		$(".words").fadeIn();
		$(".meaning").hide();
	})
});