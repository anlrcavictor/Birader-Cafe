$(document).ready(function(){ 
		$("#contactForm").validate({ 
			// Doğrulama kurallarını belirliyoruz 
			rules: { 
				name: { 
					required: true // Doldurulması zorunlu 
			},
			email: { 
				required: true ,// Doldurulması zorunlu 
				email:true
			}
		}, 
		messages: { 
			required: 'Bu alan gerekli', 
			email: 'Lütfen geçerli bir e-posta adresi giriniz' 
		},
		submitHandler: function() { 
			$.ajax({ 
				url: form.action, 
				type: 'post', 
				data: $('#contactForm').serialize(), 
				success: function(msg) { 
					$('#success').html(msg); 
				}, 
				error: function(error) { 
					$('#success').html(error); 
				} 
			});
		}
	}); 
}); 