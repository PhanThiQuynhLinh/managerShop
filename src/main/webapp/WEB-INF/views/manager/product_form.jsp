<%-- 
    Document   : product_form
    Created on : 28-Nov-2018, 8:34:38 PM
    Author     : TVD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>product form</title>
</head>
<body>

	<div class="inner-block">
		<div class="inner-block">
			<div class="inbox">
				<h2>Product Details</h2>
				<div class="col-md-12 compose-right">
					<div class="inbox-details-default">
						<div class="inbox-details-heading">Product Details</div>
						<div class="inbox-details-body">
							<div class="alert alert-info">Please fill details to send a
								new message</div>
							<form>
								<label>Category</label> <select>
									<option value="-1">Select a type</option>
									<option>a</option>
									<option>b</option>
									<option>c</option>
									<option>d</option>
								</select> <br /> <label>Name</label> <input type="text" name="name">
								<label>Price</label> <input type="text" name="price"> <label>Sale</label>
								<input type="text" name="sale"> <label>Description</label>
								<textarea rows="4" cols="50"></textarea>
								<div class="form-group">
									<div class="btn btn-default btn-file">
										<i class="fa fa-paperclip"> </i> Attachment <input type="file"
											name="attachment">
									</div>
								</div>
								<input type="submit" value="Save">
							</form>
						</div>
					</div>
				</div>

				<div class="clearfix"></div>


			</div>
		</div>
		</div>
</body>
</html>
